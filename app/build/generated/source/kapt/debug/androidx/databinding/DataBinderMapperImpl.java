package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.odifek.alc4phase1.DataBinderMapperImpl());
  }
}
