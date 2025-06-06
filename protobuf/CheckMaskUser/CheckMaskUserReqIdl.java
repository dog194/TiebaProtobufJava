package protobuf.CheckMaskUser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CheckMaskUserReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<CheckMaskUserReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CheckMaskUserReqIdl checkMaskUserReqIdl) {
            super(checkMaskUserReqIdl);
            if (checkMaskUserReqIdl == null) {
                return;
            }
            this.data = checkMaskUserReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CheckMaskUserReqIdl build(boolean z) {
            return new CheckMaskUserReqIdl(this, z);
        }
    }

    public CheckMaskUserReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}