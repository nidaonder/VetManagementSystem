package com.nidaonder.VetManagementSystem.mapper;

import com.nidaonder.VetManagementSystem.dto.request.AppointmentRequest;
import com.nidaonder.VetManagementSystem.dto.response.AppointmentResponse;
import com.nidaonder.VetManagementSystem.entities.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface AppointmentMapper {
    Appointment asEntity (AppointmentRequest appointmentRequest);
    AppointmentResponse asOutput(Appointment appointment);
    List<AppointmentResponse> asOutput(List<Appointment> appointment);
    void update(@MappingTarget Appointment entity, AppointmentRequest request);
}
