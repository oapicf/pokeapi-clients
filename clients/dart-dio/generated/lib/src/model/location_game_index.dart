//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_game_index.g.dart';

/// LocationGameIndex
///
/// Properties:
/// * [gameIndex] 
/// * [generation] 
@BuiltValue()
abstract class LocationGameIndex implements Built<LocationGameIndex, LocationGameIndexBuilder> {
  @BuiltValueField(wireName: r'game_index')
  int get gameIndex;

  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  LocationGameIndex._();

  factory LocationGameIndex([void updates(LocationGameIndexBuilder b)]) = _$LocationGameIndex;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationGameIndexBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationGameIndex> get serializer => _$LocationGameIndexSerializer();
}

class _$LocationGameIndexSerializer implements PrimitiveSerializer<LocationGameIndex> {
  @override
  final Iterable<Type> types = const [LocationGameIndex, _$LocationGameIndex];

  @override
  final String wireName = r'LocationGameIndex';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationGameIndex object, {
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
    LocationGameIndex object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationGameIndexBuilder result,
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
  LocationGameIndex deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationGameIndexBuilder();
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

