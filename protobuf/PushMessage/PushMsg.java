package protobuf.PushMessage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.PushMsgInfo;

/* loaded from: classes4.dex */
public final class PushMsg extends Message {
    public static final Integer DEFAULT_CMD = 0;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer cmd;

    @ProtoField(tag = 2)
    public final PushMsgInfo data;

    public static final class Builder extends Message.Builder<PushMsg> {
        public Integer cmd;
        public PushMsgInfo data;

        public Builder() {
        }

        public Builder(PushMsg pushMsg) {
            super(pushMsg);
            if (pushMsg == null) {
                return;
            }
            this.cmd = pushMsg.cmd;
            this.data = pushMsg.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PushMsg build(boolean z) {
            return new PushMsg(this, z);
        }
    }

    public PushMsg(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.cmd;
            if (num == null) {
                this.cmd = DEFAULT_CMD;
            } else {
                this.cmd = num;
            }
            this.data = builder.data;
            return;
        }
        this.cmd = builder.cmd;
        this.data = builder.data;
    }
}