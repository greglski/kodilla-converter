package com.kodilla.kodillaconverter.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@RequiredArgsConstructor
public class PersonDto {

    private final UUID id;
    private final String name;
    private final String familyName;
    private final LocalDate birthDate;


}
