package tbclient.HistorySwan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class HistorySwanReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<HistorySwanReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(HistorySwanReqIdl historySwanReqIdl) {
            super(historySwanReqIdl);
            if (historySwanReqIdl == null) {
                return;
            }
            this.data = historySwanReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public HistorySwanReqIdl build(boolean z) {
            return new HistorySwanReqIdl(this, z);
        }
    }

    public HistorySwanReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}