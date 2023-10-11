package hiber.model;

import  javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    private Long id;
    @Column(name = "model")
    public String model;
    @Column(name = "series")
    public int series;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
    public User setUser(User user){
        this.user = user;
        return user;
    }
    public User getUser(){
        return user;
    }
    public Car(String model, int series) {
        this.model = model;
        this.series = series;

    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", series=" + series;
    }
}
