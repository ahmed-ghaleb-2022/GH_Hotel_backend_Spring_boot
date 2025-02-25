package com.ahmedghaleb.ghhotel.service.interfac;

import com.ahmedghaleb.ghhotel.dto.Response;
import com.ahmedghaleb.ghhotel.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
