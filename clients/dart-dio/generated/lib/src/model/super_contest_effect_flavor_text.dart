//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'super_contest_effect_flavor_text.g.dart';

/// SuperContestEffectFlavorText
///
/// Properties:
/// * [flavorText] 
/// * [language] 
@BuiltValue()
abstract class SuperContestEffectFlavorText implements Built<SuperContestEffectFlavorText, SuperContestEffectFlavorTextBuilder> {
  @BuiltValueField(wireName: r'flavor_text')
  String get flavorText;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  SuperContestEffectFlavorText._();

  factory SuperContestEffectFlavorText([void updates(SuperContestEffectFlavorTextBuilder b)]) = _$SuperContestEffectFlavorText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SuperContestEffectFlavorTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SuperContestEffectFlavorText> get serializer => _$SuperContestEffectFlavorTextSerializer();
}

class _$SuperContestEffectFlavorTextSerializer implements PrimitiveSerializer<SuperContestEffectFlavorText> {
  @override
  final Iterable<Type> types = const [SuperContestEffectFlavorText, _$SuperContestEffectFlavorText];

  @override
  final String wireName = r'SuperContestEffectFlavorText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SuperContestEffectFlavorText object, {
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
    SuperContestEffectFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SuperContestEffectFlavorTextBuilder result,
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
  SuperContestEffectFlavorText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SuperContestEffectFlavorTextBuilder();
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

