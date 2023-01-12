package com.kstatharas.essentials.controllers;

import com.kstatharas.essentials.models.Room;
import com.kstatharas.essentials.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomService _roomService;

    public RoomRestController(RoomService _roomService) {
        this._roomService = _roomService;
    }

    @GetMapping
    public List<Room> getAllRooms(){
        return _roomService.getAllRooms();
    }
}
