package com.goinmuls.sidehub.application.port.out;

/**
 * 출석 체크 Application OutPort
 */
public interface AttendanceOutPort {
    void createAttendance(Long memberId);
}
