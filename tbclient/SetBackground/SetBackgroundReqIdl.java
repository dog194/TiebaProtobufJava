package tbclient.SetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SetBackgroundReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<SetBackgroundReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SetBackgroundReqIdl setBackgroundReqIdl) {
            super(setBackgroundReqIdl);
            if (setBackgroundReqIdl == null) {
                return;
            }
            this.data = setBackgroundReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SetBackgroundReqIdl build(boolean z) {
            return new SetBackgroundReqIdl(this, z);
        }
    }

    public SetBackgroundReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}