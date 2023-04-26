package miu.swa.creatorservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CSData {

    private String topic;
    private long fixedRateInMilliseconds;
}
