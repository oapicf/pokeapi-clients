//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'language_detail.g.dart';

/// LanguageDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [official] 
/// * [iso639] 
/// * [iso3166] 
/// * [names] 
@BuiltValue()
abstract class LanguageDetail implements Built<LanguageDetail, LanguageDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'official')
  bool? get official;

  @BuiltValueField(wireName: r'iso639')
  String get iso639;

  @BuiltValueField(wireName: r'iso3166')
  String get iso3166;

  @BuiltValueField(wireName: r'names')
  BuiltList<LanguageName> get names;

  LanguageDetail._();

  factory LanguageDetail([void updates(LanguageDetailBuilder b)]) = _$LanguageDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LanguageDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LanguageDetail> get serializer => _$LanguageDetailSerializer();
}

class _$LanguageDetailSerializer implements PrimitiveSerializer<LanguageDetail> {
  @override
  final Iterable<Type> types = const [LanguageDetail, _$LanguageDetail];

  @override
  final String wireName = r'LanguageDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LanguageDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.official != null) {
      yield r'official';
      yield serializers.serialize(
        object.official,
        specifiedType: const FullType(bool),
      );
    }
    yield r'iso639';
    yield serializers.serialize(
      object.iso639,
      specifiedType: const FullType(String),
    );
    yield r'iso3166';
    yield serializers.serialize(
      object.iso3166,
      specifiedType: const FullType(String),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(LanguageName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LanguageDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LanguageDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'official':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.official = valueDes;
          break;
        case r'iso639':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.iso639 = valueDes;
          break;
        case r'iso3166':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.iso3166 = valueDes;
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LanguageName)]),
          ) as BuiltList<LanguageName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LanguageDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LanguageDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

