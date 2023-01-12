package com.kstatharas.essentials.data;

import com.kstatharas.essentials.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
