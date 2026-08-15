//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ability_effect_text.g.dart';

/// AbilityEffectText
///
/// Properties:
/// * [effect] 
/// * [shortEffect] 
/// * [language] 
@BuiltValue()
abstract class AbilityEffectText implements Built<AbilityEffectText, AbilityEffectTextBuilder> {
  @BuiltValueField(wireName: r'effect')
  String get effect;

  @BuiltValueField(wireName: r'short_effect')
  String get shortEffect;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  AbilityEffectText._();

  factory AbilityEffectText([void updates(AbilityEffectTextBuilder b)]) = _$AbilityEffectText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AbilityEffectTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AbilityEffectText> get serializer => _$AbilityEffectTextSerializer();
}

class _$AbilityEffectTextSerializer implements PrimitiveSerializer<AbilityEffectText> {
  @override
  final Iterable<Type> types = const [AbilityEffectText, _$AbilityEffectText];

  @override
  final String wireName = r'AbilityEffectText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AbilityEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'effect';
    yield serializers.serialize(
      object.effect,
      specifiedType: const FullType(String),
    );
    yield r'short_effect';
    yield serializers.serialize(
      object.shortEffect,
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
    AbilityEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AbilityEffectTextBuilder result,
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
        case r'short_effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.shortEffect = valueDes;
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
  AbilityEffectText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AbilityEffectTextBuilder();
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

