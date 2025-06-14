package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CompleteTaskReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<CompleteTaskReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CompleteTaskReqIdl completeTaskReqIdl) {
            super(completeTaskReqIdl);
            if (completeTaskReqIdl == null) {
                return;
            }
            this.data = completeTaskReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CompleteTaskReqIdl build(boolean z) {
            return new CompleteTaskReqIdl(this, z);
        }
    }

    public CompleteTaskReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}