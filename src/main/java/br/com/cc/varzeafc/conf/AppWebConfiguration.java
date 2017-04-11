package br.com.cc.varzeafc.conf;

import java.util.ArrayList;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.cc.varzeafc.models.Grupo;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "br.com.cc.varzeafc")
public class AppWebConfiguration extends WebMvcConfigurerAdapter
{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
    }
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new StringToGrupoConverter(new ArrayList<Grupo>()));
	}
}
