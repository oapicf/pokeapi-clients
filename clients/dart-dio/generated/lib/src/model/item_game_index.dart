//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_game_index.g.dart';

/// ItemGameIndex
///
/// Properties:
/// * [gameIndex] 
/// * [generation] 
@BuiltValue()
abstract class ItemGameIndex implements Built<ItemGameIndex, ItemGameIndexBuilder> {
  @BuiltValueField(wireName: r'game_index')
  int get gameIndex;

  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  ItemGameIndex._();

  factory ItemGameIndex([void updates(ItemGameIndexBuilder b)]) = _$ItemGameIndex;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemGameIndexBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemGameIndex> get serializer => _$ItemGameIndexSerializer();
}

class _$ItemGameIndexSerializer implements PrimitiveSerializer<ItemGameIndex> {
  @override
  final Iterable<Type> types = const [ItemGameIndex, _$ItemGameIndex];

  @override
  final String wireName = r'ItemGameIndex';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemGameIndex object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'game_index';
    yield serializers.serialize(
      object.gameIndex,
      specifiedType: const FullType(int),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemGameIndex object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemGameIndexBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'game_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.gameIndex = valueDes;
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemGameIndex deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemGameIndexBuilder();
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

