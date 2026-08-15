//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_fling_effect_summary.g.dart';

/// ItemFlingEffectSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class ItemFlingEffectSummary implements Built<ItemFlingEffectSummary, ItemFlingEffectSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  ItemFlingEffectSummary._();

  factory ItemFlingEffectSummary([void updates(ItemFlingEffectSummaryBuilder b)]) = _$ItemFlingEffectSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemFlingEffectSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemFlingEffectSummary> get serializer => _$ItemFlingEffectSummarySerializer();
}

class _$ItemFlingEffectSummarySerializer implements PrimitiveSerializer<ItemFlingEffectSummary> {
  @override
  final Iterable<Type> types = const [ItemFlingEffectSummary, _$ItemFlingEffectSummary];

  @override
  final String wireName = r'ItemFlingEffectSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemFlingEffectSummary object, {
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
    ItemFlingEffectSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemFlingEffectSummaryBuilder result,
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
  ItemFlingEffectSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemFlingEffectSummaryBuilder();
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

