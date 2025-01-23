package com.eventostec.api.domain.address;

import com.eventostec.api.domain.event.Event;
import com.eventostec.api.domain.event.EventRequestDTO;

public record AddressRequestDTO(EventRequestDTO data, Event event) {
}
