package cl.cmartinezs.stl4j.task.utils.consumer;

import java.util.function.Consumer;

import cl.cmartinezs.stl4j.task.Task;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TaskConsumerFactory {

    public static Consumer<Task> empty(){
        return task -> { };
    }
}
