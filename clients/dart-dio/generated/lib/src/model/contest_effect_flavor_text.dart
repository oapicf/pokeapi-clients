//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'contest_effect_flavor_text.g.dart';

/// ContestEffectFlavorText
///
/// Properties:
/// * [flavorText] 
/// * [language] 
@BuiltValue()
abstract class ContestEffectFlavorText implements Built<ContestEffectFlavorText, ContestEffectFlavorTextBuilder> {
  @BuiltValueField(wireName: r'flavor_text')
  String get flavorText;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  ContestEffectFlavorText._();

  factory ContestEffectFlavorText([void updates(ContestEffectFlavorTextBuilder b)]) = _$ContestEffectFlavorText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ContestEffectFlavorTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ContestEffectFlavorText> get serializer => _$ContestEffectFlavorTextSerializer();
}

class _$ContestEffectFlavorTextSerializer implements PrimitiveSerializer<ContestEffectFlavorText> {
  @override
  final Iterable<Type> types = const [ContestEffectFlavorText, _$ContestEffectFlavorText];

  @override
  final String wireName = r'ContestEffectFlavorText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ContestEffectFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'flavor_text';
    yield serializers.serialize(
      object.flavorText,
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
    ContestEffectFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ContestEffectFlavorTextBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'flavor_text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.flavorText = valueDes;
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
  ContestEffectFlavorText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ContestEffectFlavorTextBuilder();
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

