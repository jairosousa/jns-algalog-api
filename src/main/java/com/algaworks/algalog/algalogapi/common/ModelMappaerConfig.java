package com.algaworks.algalog.algalogapi.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 16:35
 */
@Configuration
public class ModelMappaerConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
