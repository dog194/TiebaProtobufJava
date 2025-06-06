package protobuf.LogStat;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class LogStatResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<LogStatResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(LogStatResIdl logStatResIdl) {
            super(logStatResIdl);
            if (logStatResIdl == null) {
                return;
            }
            this.error = logStatResIdl.error;
            this.data = logStatResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public LogStatResIdl build(boolean z) {
            return new LogStatResIdl(this, z);
        }
    }

    public LogStatResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}