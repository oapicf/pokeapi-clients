//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'currency_name.g.dart';

/// CurrencyName
///
/// Properties:
/// * [name] - The localized name for an API resource in a specific language.
/// * [language] - The language this name is in.
@BuiltValue()
abstract class CurrencyName implements Built<CurrencyName, CurrencyNameBuilder> {
  /// The localized name for an API resource in a specific language.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The language this name is in.
  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  CurrencyName._();

  factory CurrencyName([void updates(CurrencyNameBuilder b)]) = _$CurrencyName;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CurrencyNameBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CurrencyName> get serializer => _$CurrencyNameSerializer();
}

class _$CurrencyNameSerializer implements PrimitiveSerializer<CurrencyName> {
  @override
  final Iterable<Type> types = const [CurrencyName, _$CurrencyName];

  @override
  final String wireName = r'CurrencyName';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CurrencyName object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(LanguageSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CurrencyName object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CurrencyNameBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LanguageSummary),
          ) as LanguageSummary;
          result.language.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CurrencyName deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CurrencyNameBuilder();
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


