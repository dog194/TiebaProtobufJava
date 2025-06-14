package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_MD5 = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_WEBVIEW_VERSION = "";

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer force_replace;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String md5;

    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<Offpack> offpack_list;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String src;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String webview_version;
    public static final List<Offpack> DEFAULT_OFFPACK_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FORCE_REPLACE = 0;

    public static final class Builder extends Message.Builder<DataRes> {
        public Integer force_replace;
        public String md5;
        public List<Offpack> offpack_list;
        public String src;
        public String webview_version;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.src = dataRes.src;
            this.webview_version = dataRes.webview_version;
            this.md5 = dataRes.md5;
            this.offpack_list = Message.copyOf(dataRes.offpack_list);
            this.force_replace = dataRes.force_replace;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.src;
            if (str == null) {
                this.src = "";
            } else {
                this.src = str;
            }
            String str2 = builder.webview_version;
            if (str2 == null) {
                this.webview_version = "";
            } else {
                this.webview_version = str2;
            }
            String str3 = builder.md5;
            if (str3 == null) {
                this.md5 = "";
            } else {
                this.md5 = str3;
            }
            List<Offpack> list = builder.offpack_list;
            if (list == null) {
                this.offpack_list = DEFAULT_OFFPACK_LIST;
            } else {
                this.offpack_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.force_replace;
            if (num == null) {
                this.force_replace = DEFAULT_FORCE_REPLACE;
                return;
            } else {
                this.force_replace = num;
                return;
            }
        }
        this.src = builder.src;
        this.webview_version = builder.webview_version;
        this.md5 = builder.md5;
        this.offpack_list = Message.immutableCopyOf(builder.offpack_list);
        this.force_replace = builder.force_replace;
    }
}