package com.kien.knightroot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kien.knightroot.entity.ThemeParkRide;

public interface ThemeParkRideRepository extends JpaRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name);
}
