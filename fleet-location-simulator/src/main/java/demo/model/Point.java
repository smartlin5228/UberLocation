package demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by vagrant on 12/2/16.
 */
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Point {
    private double latitude;
    private double longitude;

    @Override
    public String toString() {
        return "Point [lat/lang:" + latitude + "," + longitude + "]";
    }

}
