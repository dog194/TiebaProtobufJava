package tbclient.AdNewLog;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AdNewLogReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<AdNewLogReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AdNewLogReqIdl adNewLogReqIdl) {
            super(adNewLogReqIdl);
            if (adNewLogReqIdl == null) {
                return;
            }
            this.data = adNewLogReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AdNewLogReqIdl build(boolean z) {
            return new AdNewLogReqIdl(this, z);
        }
    }

    public AdNewLogReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}