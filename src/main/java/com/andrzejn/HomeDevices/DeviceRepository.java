package com.andrzejn.HomeDevices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrzejn.HomeDevices.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

}
