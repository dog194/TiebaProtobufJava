package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class TaskProgress extends Message {

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer current;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer total;
    public static final Integer DEFAULT_TOTAL = 0;
    public static final Integer DEFAULT_CURRENT = 0;

    public static final class Builder extends Message.Builder<TaskProgress> {
        public Integer current;
        public Integer total;

        public Builder() {
        }

        public Builder(TaskProgress taskProgress) {
            super(taskProgress);
            if (taskProgress == null) {
                return;
            }
            this.total = taskProgress.total;
            this.current = taskProgress.current;
        }

        @Override // com.squareup.wire.Message.Builder
        public TaskProgress build(boolean z) {
            return new TaskProgress(this, z);
        }
    }

    public TaskProgress(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.total;
            if (num == null) {
                this.total = DEFAULT_TOTAL;
            } else {
                this.total = num;
            }
            Integer num2 = builder.current;
            if (num2 == null) {
                this.current = DEFAULT_CURRENT;
                return;
            } else {
                this.current = num2;
                return;
            }
        }
        this.total = builder.total;
        this.current = builder.current;
    }
}