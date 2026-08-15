//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_flavor_text.g.dart';

/// MoveFlavorText
///
/// Properties:
/// * [flavorText] 
/// * [language] 
/// * [versionGroup] 
@BuiltValue()
abstract class MoveFlavorText implements Built<MoveFlavorText, MoveFlavorTextBuilder> {
  @BuiltValueField(wireName: r'flavor_text')
  String get flavorText;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  MoveFlavorText._();

  factory MoveFlavorText([void updates(MoveFlavorTextBuilder b)]) = _$MoveFlavorText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveFlavorTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveFlavorText> get serializer => _$MoveFlavorTextSerializer();
}

class _$MoveFlavorTextSerializer implements PrimitiveSerializer<MoveFlavorText> {
  @override
  final Iterable<Type> types = const [MoveFlavorText, _$MoveFlavorText];

  @override
  final String wireName = r'MoveFlavorText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveFlavorText object, {
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
    MoveFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveFlavorTextBuilder result,
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
  MoveFlavorText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveFlavorTextBuilder();
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

