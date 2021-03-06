package com.rudyii.hs.common.objects.logs;

import com.rudyii.hs.common.type.ServerStateType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StartStopLog extends LogBase {
    private ServerStateType serverState;
    private int pid;
}
