package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CheckPostReqIdl extends Message {

    @ProtoField(tag = 1)
    public final ReqData data;

    public static final class Builder extends Message.Builder<CheckPostReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(CheckPostReqIdl checkPostReqIdl) {
            super(checkPostReqIdl);
            if (checkPostReqIdl == null) {
                return;
            }
            this.data = checkPostReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CheckPostReqIdl build(boolean z) {
            return new CheckPostReqIdl(this, z);
        }
    }

    public CheckPostReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}