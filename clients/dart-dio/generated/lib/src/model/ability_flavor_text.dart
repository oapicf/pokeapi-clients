//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ability_flavor_text.g.dart';

/// AbilityFlavorText
///
/// Properties:
/// * [flavorText] 
/// * [language] 
/// * [versionGroup] 
@BuiltValue()
abstract class AbilityFlavorText implements Built<AbilityFlavorText, AbilityFlavorTextBuilder> {
  @BuiltValueField(wireName: r'flavor_text')
  String get flavorText;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  AbilityFlavorText._();

  factory AbilityFlavorText([void updates(AbilityFlavorTextBuilder b)]) = _$AbilityFlavorText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AbilityFlavorTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AbilityFlavorText> get serializer => _$AbilityFlavorTextSerializer();
}

class _$AbilityFlavorTextSerializer implements PrimitiveSerializer<AbilityFlavorText> {
  @override
  final Iterable<Type> types = const [AbilityFlavorText, _$AbilityFlavorText];

  @override
  final String wireName = r'AbilityFlavorText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AbilityFlavorText object, {
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
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AbilityFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AbilityFlavorTextBuilder result,
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
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AbilityFlavorText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AbilityFlavorTextBuilder();
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

