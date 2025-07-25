package com.goinmuls.sidehub.application.port.in;

/**
 * 출석체크 insert 유즈케이스
 */
public interface CreateAttendanceUseCase {
    void checkAttendance(Long memberId);
}
