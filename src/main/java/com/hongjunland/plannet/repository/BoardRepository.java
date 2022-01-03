package com.hongjunland.plannet.repository;

import com.hongjunland.plannet.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
