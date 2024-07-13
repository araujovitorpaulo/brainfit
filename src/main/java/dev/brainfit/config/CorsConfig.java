package dev.brainfit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aplica o filtro CORS a todas as URLs
                .allowedOriginPatterns("*") // Permite solicitações de qualquer origem
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite os métodos HTTP especificados
                .allowedHeaders("*") // Permite todos os cabeçalhos
                .allowCredentials(true) // Permite o envio de credenciais (por exemplo, cookies)
                .maxAge(3600); // Define o tempo máximo de vida do pre-flight request em segundos
    }
}
