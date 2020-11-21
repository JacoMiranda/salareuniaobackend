package com.dio.salareuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.salareuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{


}
