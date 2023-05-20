package com.burakkolay.akbankhw2.dto.customer;

import com.burakkolay.akbankhw2.enums.EnumTypes;

public record CustomerSaveRequest(String name,
                                  String surname,
                                  String username,
                                  String email,
                                  String phone,
                                  EnumTypes type) {
}
