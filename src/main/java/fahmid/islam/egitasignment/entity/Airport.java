package fahmid.islam.egitasignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Airport{

    @Id
    @GeneratedValue
    private int id;
    private String code;
    private String name;
    private String cityName;
    private double latitude;
    private double longitude;
}