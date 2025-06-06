package protobuf.LogStat;

import com.squareup.wire.Message;

/* loaded from: classes4.dex */
public final class DataRes extends Message {

    public static final class Builder extends Message.Builder<DataRes> {
        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
    }
}