package com.kstatharas.essentials.controllers;

import com.kstatharas.essentials.models.Room;
import com.kstatharas.essentials.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService _roomService;

    public RoomController(RoomService _roomService) {
        this._roomService = _roomService;
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", _roomService.getAllRooms());
        return "rooms";
    }
}
