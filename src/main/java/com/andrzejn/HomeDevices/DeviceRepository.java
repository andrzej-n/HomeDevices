package com.andrzejn.HomeDevices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrzejn.HomeDevices.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
