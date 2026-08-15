//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ability_change_effect_text.g.dart';

/// AbilityChangeEffectText
///
/// Properties:
/// * [effect] 
/// * [language] 
@BuiltValue()
abstract class AbilityChangeEffectText implements Built<AbilityChangeEffectText, AbilityChangeEffectTextBuilder> {
  @BuiltValueField(wireName: r'effect')
  String get effect;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  AbilityChangeEffectText._();

  factory AbilityChangeEffectText([void updates(AbilityChangeEffectTextBuilder b)]) = _$AbilityChangeEffectText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AbilityChangeEffectTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AbilityChangeEffectText> get serializer => _$AbilityChangeEffectTextSerializer();
}

class _$AbilityChangeEffectTextSerializer implements PrimitiveSerializer<AbilityChangeEffectText> {
  @override
  final Iterable<Type> types = const [AbilityChangeEffectText, _$AbilityChangeEffectText];

  @override
  final String wireName = r'AbilityChangeEffectText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AbilityChangeEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'effect';
    yield serializers.serialize(
      object.effect,
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
    AbilityChangeEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AbilityChangeEffectTextBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.effect = valueDes;
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
  AbilityChangeEffectText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AbilityChangeEffectTextBuilder();
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

