package tbclient.DelAllUserData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DelAllUserDataReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<DelAllUserDataReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(DelAllUserDataReqIdl delAllUserDataReqIdl) {
            super(delAllUserDataReqIdl);
            if (delAllUserDataReqIdl == null) {
                return;
            }
            this.data = delAllUserDataReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public DelAllUserDataReqIdl build(boolean z) {
            return new DelAllUserDataReqIdl(this, z);
        }
    }

    public DelAllUserDataReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}