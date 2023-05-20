package com.burakkolay.akbankhw2.dto.customer;

import com.burakkolay.akbankhw2.enums.EnumTypes;

public record CustomerUpdateRequest(String username,
                                    String email,
                                    String phone) {
}
