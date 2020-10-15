package com.zhihao.boot.launch.model;

import com.zhihao.boot.launch.service.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
@PropertySource(value = "classpath:family.yml", factory = MixPropertySourceFactory.class)
public class Family {

    //@Value("${family.family-name}")
    @NotEmpty
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;

}
