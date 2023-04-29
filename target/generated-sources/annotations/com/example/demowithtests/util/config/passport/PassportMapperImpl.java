package com.example.demowithtests.util.config.passport;

import com.example.demowithtests.domain.Passport;
import com.example.demowithtests.domain.Visa;
import com.example.demowithtests.dto.passport.PassportRequestDto;
import com.example.demowithtests.dto.passport.PassportResponseDto;
import com.example.demowithtests.dto.passport.VisaDto;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-29T18:23:29+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class PassportMapperImpl implements PassportMapper {

    @Override
    public Passport fromRequestDto(PassportRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Passport passport = new Passport();

        passport.setFirstName( requestDto.firstName );
        passport.setSecondName( requestDto.secondName );
        Set<Visa> set = requestDto.visas;
        if ( set != null ) {
            passport.setVisas( new HashSet<Visa>( set ) );
        }

        return passport;
    }

    @Override
    public PassportRequestDto toRequestDto(Passport passport) {
        if ( passport == null ) {
            return null;
        }

        PassportRequestDto passportRequestDto = new PassportRequestDto();

        passportRequestDto.firstName = passport.getFirstName();
        passportRequestDto.secondName = passport.getSecondName();
        Set<Visa> set = passport.getVisas();
        if ( set != null ) {
            passportRequestDto.visas = new HashSet<Visa>( set );
        }

        return passportRequestDto;
    }

    @Override
    public PassportResponseDto toResponseDto(Passport passport) {
        if ( passport == null ) {
            return null;
        }

        PassportResponseDto passportResponseDto = new PassportResponseDto();

        passportResponseDto.setFirstName( passport.getFirstName() );
        passportResponseDto.setSecondName( passport.getSecondName() );
        passportResponseDto.setVisasDto( fromVisas( passport.getVisas() ) );

        return passportResponseDto;
    }

    @Override
    public Passport fromResponseDto(PassportResponseDto responseDto) {
        if ( responseDto == null ) {
            return null;
        }

        Passport passport = new Passport();

        passport.setFirstName( responseDto.getFirstName() );
        passport.setSecondName( responseDto.getSecondName() );

        return passport;
    }

    @Override
    public Set<VisaDto> fromVisas(Set<Visa> visas) {
        if ( visas == null ) {
            return null;
        }

        Set<VisaDto> set = new HashSet<VisaDto>( Math.max( (int) ( visas.size() / .75f ) + 1, 16 ) );
        for ( Visa visa : visas ) {
            set.add( map( visa ) );
        }

        return set;
    }

    @Override
    public Set<Visa> fromVisasDto(Set<VisaDto> visasDto) {
        if ( visasDto == null ) {
            return null;
        }

        Set<Visa> set = new HashSet<Visa>( Math.max( (int) ( visasDto.size() / .75f ) + 1, 16 ) );
        for ( VisaDto visaDto : visasDto ) {
            set.add( map( visaDto ) );
        }

        return set;
    }

    @Override
    public Visa map(VisaDto visaDto) {
        if ( visaDto == null ) {
            return null;
        }

        Visa visa = new Visa();

        visa.setName( visaDto.getName() );
        visa.setYearEnding( visaDto.getYearEnding() );

        return visa;
    }

    @Override
    public VisaDto map(Visa visa) {
        if ( visa == null ) {
            return null;
        }

        VisaDto visaDto = new VisaDto();

        visaDto.setName( visa.getName() );
        visaDto.setYearEnding( visa.getYearEnding() );

        return visaDto;
    }
}
