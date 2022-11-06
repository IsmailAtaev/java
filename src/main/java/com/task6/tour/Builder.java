package com.task6.tour;

import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public interface Builder {
    Tour setCountry(String country);

    Tour setTourType(TourType tourType);

    Tour setTransportType(TransportType transportType);

    Tour setTourName(String tourName);

    Tour setCountDay(int countDay);

    Tour setPrice(float price);

}
