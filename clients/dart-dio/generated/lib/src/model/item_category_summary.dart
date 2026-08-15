//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_category_summary.g.dart';

/// ItemCategorySummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class ItemCategorySummary implements Built<ItemCategorySummary, ItemCategorySummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  ItemCategorySummary._();

  factory ItemCategorySummary([void updates(ItemCategorySummaryBuilder b)]) = _$ItemCategorySummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemCategorySummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemCategorySummary> get serializer => _$ItemCategorySummarySerializer();
}

class _$ItemCategorySummarySerializer implements PrimitiveSerializer<ItemCategorySummary> {
  @override
  final Iterable<Type> types = const [ItemCategorySummary, _$ItemCategorySummary];

  @override
  final String wireName = r'ItemCategorySummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemCategorySummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemCategorySummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemCategorySummaryBuilder result,
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
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemCategorySummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemCategorySummaryBuilder();
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

