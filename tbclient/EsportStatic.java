package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class EsportStatic extends Message {
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<EsportStatic> {
        public String img;
        public String url;

        public Builder() {
        }

        public Builder(EsportStatic esportStatic) {
            super(esportStatic);
            if (esportStatic == null) {
                return;
            }
            this.img = esportStatic.img;
            this.url = esportStatic.url;
        }

        @Override // com.squareup.wire.Message.Builder
        public EsportStatic build(boolean z) {
            return new EsportStatic(this, z);
        }
    }

    public EsportStatic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img;
            if (str == null) {
                this.img = "";
            } else {
                this.img = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.img = builder.img;
        this.url = builder.url;
    }
}