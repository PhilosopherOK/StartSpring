package org.example.springCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public JasMusic jasMusic(){
        return new JasMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer();

    }


}
//<bean id="springstart1"
//class="org.example.springCore.RockMusic">
//</bean>
//<bean id="springstart2"
//class="org.example.springCore.ClassicalMusic">
//</bean>
//<bean id="springstart3"
//class="org.example.springCore.JasMusic">
//</bean>
//
//<bean id="musicplayer"
//class="org.example.springCore.MusicPlayer">
//<property name="listOfMusic">
//<list>
//<ref bean="springstart1"/>
//<ref bean="springstart2"/>
//<ref bean="springstart3"/>
//</list>
//</property>
//</bean>