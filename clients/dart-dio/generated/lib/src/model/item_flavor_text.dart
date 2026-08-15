//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_flavor_text.g.dart';

/// ItemFlavorText
///
/// Properties:
/// * [text] 
/// * [versionGroup] 
/// * [language] 
@BuiltValue()
abstract class ItemFlavorText implements Built<ItemFlavorText, ItemFlavorTextBuilder> {
  @BuiltValueField(wireName: r'text')
  String get text;

  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  ItemFlavorText._();

  factory ItemFlavorText([void updates(ItemFlavorTextBuilder b)]) = _$ItemFlavorText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemFlavorTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemFlavorText> get serializer => _$ItemFlavorTextSerializer();
}

class _$ItemFlavorTextSerializer implements PrimitiveSerializer<ItemFlavorText> {
  @override
  final Iterable<Type> types = const [ItemFlavorText, _$ItemFlavorText];

  @override
  final String wireName = r'ItemFlavorText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
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
    ItemFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemFlavorTextBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
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
  ItemFlavorText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemFlavorTextBuilder();
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

